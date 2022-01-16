This is sample microservice application, it has a very simple docker file to create this micro service application as a image file by compiling the source code and executing test cases create a image and run it on demand.

To create docker image you can use the command, 
	docker build --tag=javamvndockersample .
To run the docker image	you can use the command,
	docker run -p 8080:8080 javamvndockersample