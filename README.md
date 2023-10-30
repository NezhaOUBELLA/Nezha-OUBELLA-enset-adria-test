Rapport de l'Évaluation Architectures Micro-services

1. Création un Empty Project incluant les micro-services suivants : wallet-service, transfer-service, gateway-service, discovery-service et config-service :
Aprés avoir demmarer consul en utilisant la ligne de commande et en executant cette commande :
consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=ipAdresse
où ipAdresse est l'adresse IP de votre machine.
Je dois configurer le fichier d'acces au service. Pour cela, j'ai creé un fichier nomme config-service et un autre discovery-service

2. Développer et tester les micro-services discovery-service et gateway-service et config-service
![Alt text](image.png)
3. Développer et tester le micro-service wallet-service
Aprés avoir runner le service wallet-service il est ajouté automatiquement a consul
![Alt text](image-1.png)

Voila les donnes dans la base de donnees :
La table Client :
![Alt text](image-2.png)
![Alt text](image-4.png)
La table Wallet :
![Alt text](image-3.png)
![Alt text](image-5.png)
en utilisant la gateway :
![Alt text](image-6.png)
avec la projection :
![Alt text](image-7.png)

5. Développer un simple frontend web pour l’application
Dans ce cas, j'ai utiliser AngularJS pour le frontend car c'est une technologie que je maitrise bien
voici l'affichage des clients :
![Alt text](image-8.png)
![Alt text](image-9.png)
les wallet de client 1 :
![Alt text](image-10.png)


Realise par :
Nezha OUBELLA
GLSID3
![Alt text](<My picture.jpg>)