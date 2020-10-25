# DockerAssignment

This is a repository for CS6065: Cloud Computing HW2 

* Dockerfile contains code for creating/setting up the docker image. Code for the assignment is writtten in java, so we create a java docker (openjdk8) instance.
* WordCount.java reads files that are stored on the container in /home/data folder and will perform all instructed operations from the hw and will write to /home/output/results.txt file. The code will also print the contents of results.txt file before terminating.
* Here I assumed that words can only be separated by spaces. Other delimiters such as comma etc. are ignored. 



To run the homework (assuming that docker is already installed and you are in the current folder):
* First run ```docker pull alpine```
* Then, ```docker build -t 'name:tag' .```. This will create the docker container with java installed and the execution of the WordCount as its entrypoint
* Run ```docker run -v local-data-folder-path:/home/data name:tag``` to verify if code runs.
* For the purpose of this assigment, i have assumed the name as gadiravi and tag as latest. In order to save the image, we used the following commands:

```docker save -o gadiravi-latest.tar gadiravi:latest```

The saved tar file has been uploaded as requested. 
* To load the saved image, use ```docker load -i gadiravi-latest.tar``` and use the run command listed above to get the same result. 

