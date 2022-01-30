import http from 'k6/http'
import { check, sleep } from 'k6'


export let options = {

    vus: 2,
    duration: '20s',
    //iterations:10,
 
    // stages: [
    //     {duration: '15s', target: 50},
    //     {duration: '10s', target: 50},
    //     {duration: '5s', target: 0}
    // ],

    thresholds: {  
        
        // 80% of requests must finish within 3s
        // 100% of requests must finish within 6s
        //http_req_duration: ["p(80) < 3000", "p(100) < 6000"],

        // 100% of requests must finish within 3 ms
        //http_req_duration: ["avg<1000"]      
    },
}


export default function(){
  
    const res = http.get('http://localhost:8080/swagger2-demo/getStudents');
    
    check(res, {
        'is status 200': (r) => r.status === 200
      }); 
      
    sleep(1);
}