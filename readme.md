Endpoints list below

GET:
http://localhost:8080/kafka/test
http://localhost:8080/basic/send/message/jonSnow

post:
http://localhost:8080/kafka/send/customer/message

payload:

{
"firstName":"Jon",
"lastName":"Snow",
"location":"United Kingdom",
"customerId":12345776,
"salary":15550.55
}

Important commands: run in the same sequence

Run zookeeper server with config file: ./bin/zookeeper-server-start.sh ./config/zookeeper.properties
Run kafka server with config file: ./bin/kafka-server-start.sh ./config/server.properties
Create kafka topic: ./bin/kafktopics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic example-topic-1
Listen/create kafka consumer: ./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic example-topic-1 --from-beginning
