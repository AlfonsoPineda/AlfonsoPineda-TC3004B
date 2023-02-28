# AlfonsoPineda-TC3004B

Docker hub user: alfonsopineda/demop-spring

### **Empujar a docker hub**

> docker login

docker build -t demop-spring .

docker tag demop-spring alfonsopineda/demop-spring:1

docker push alfonsopineda/demop-spring:1



### **Correr proyecto subido en docker hub**

docker run -p 8080:8080 alfonsopineda/demop-spring:1
