
# Tested with Postman App.
# 
![Ekran görüntüsü 2022-04-13 021813](https://user-images.githubusercontent.com/75884873/163071368-3192d6fd-be6a-462f-b1f1-ac357d328925.png)
![Ekran görüntüsü 2022-04-13 021938](https://user-images.githubusercontent.com/75884873/163071369-ecce06bf-5858-4d38-a840-e65aa37bd06a.png)
![Ekran görüntüsü 2022-04-13 022108](https://user-images.githubusercontent.com/75884873/163071371-fb006c88-f892-4bb6-b279-3aeea5617714.png)
![Ekran görüntüsü 2022-04-13 022159](https://user-images.githubusercontent.com/75884873/163071375-0a83757f-d623-4269-81ad-4890fd804941.png)
![Ekran görüntüsü 2022-04-13 022242](https://user-images.githubusercontent.com/75884873/163071378-9c4c6731-2840-4991-86dd-062ab5de545b.png)
# 






# java Spring Boot Project [BUILD]
____________________________________________________________________________________________________
		project->Run As->
				Maven Build
				->Main >Goals="clean install spring-boot:run"
										&&
							   "clean install spring-boot:repackage"
				->JRE ->VM arguments:"-Dmaven.test.skip=true"  //skip tests
				

		project->Run As->Run Configuration
						->JRE->
						 VM arguments="-Dmaven.test.skip=true" //skip test
				
				
		project->Run As->				
				spring devtools client->
							Main->
							Goals="clean install spring-boot:repackage"
		
# Docker
______________________________________________________________________________________________	
	then							
 	find project->.jar file	
			using this direction
				and add Dockerfile  //->not file format
								[

								FROM openjdk:17-oracle  		//->free use
									ARG JAR_FILE=*.jar
									CPY ${JAR_FILE} -file name-.jar
									EXPOSE 1071					//->port:1071	
									ENTRYPOINT ["java","-jar","/-file name.jar"]
									
									]
						
				
		****.jar file ..buil Docker image*****
			
			command-> docker build -t  -docker image file name-
			....
			....building finished..
			
			GO GO-> Docker UI -> Images ->//You will see -docker image file name-
			
			------------------
			new create instance
			
			command -> docker run -cpuset-cpus=1,3,5 --name instanceName --rm -p 1071:1071 -d -docker image file name-    
				&&
				command -> docker run --cpus=0.50 --name instanceName --rm -p 1072:1071 -d -docker image file name-   


# ****create docker network then create mysql image***
			
			command-> docker network create newNetwotkName
			
			command-> docker pull mysql
			....downloading mysql file for mysql image...
			
			***create new mysql instance
			command-> docker run --network=NetwotkName  --name newMysqlInstanceName --rm -p 3306:3306 -d mysql
			
			command-< docker run -e "SPRINGDATASOURCE_URL=
			jdbc:mysql://MysqlInstanceName:3306/databseName?usePublicKeyRetrieval=true&useSSL=false"
			--network=NetwotkName --name newInstanceName --rm -p outPort:inPort -i  dockerImageName
			
