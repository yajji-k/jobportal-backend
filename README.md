**Backend Notes to learn while Building**

Main starter class consists of following

@SpringBootApplication - is a shortcut for 3 annotations 

1.  @Configuration
    
2.  @EnableAutoConfiguration
    
3.  @ComponentScan
    

SpringApplication.run(classname.class, args);

*   Starts your application with all the auto-configured settings and scans the components for components like @RestController, etc., and launches the server if web-app
    

Controller class consists of the following

@RestController - tells spring to treat the controller as a Web/Rest Controller and serialise to return values as JSON

@RequestMapping({api type and endpoint}) - maps the endpoint inside the () to whatever is given inside the (), if nothing is added then it sets it to GET

@GetMapping({api endpoint}) - maps the GET API to the Api endpoint inside the ()

@PostMapping({api endpoint}) - maps the POST API to the Api endpoint inside the ()

_@RequestBody_ requestType entity -

*   @RequestBody tells the Spring to deserialise the Request body to json and map it to the entity
    
*   requestType is the datatype of the entity to which the spring converts the data to
    
*   Entity is the actual request body which is coming in the API request
