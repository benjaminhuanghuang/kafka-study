


## Topics
A particular stream of data
Similar to a database table


## Partition
Topics are splited into partitions

## Brokers
Broker is a server
A Kafka clusster = multiple brokers


## Replication
Leader and ISR(in-sync replica) are handled by Zookeeper.

## Producer
Producers write data to topics
Producers know which broker and partition to write to.

## Consumer
Read data from a topic (by name)
know which broker and partition to read from.

Each consumer within a group reads from exclusive partitions

## Zookeeper
Manages brokers
Sends notifications to Kafka
Kafka can NOT work without Zookeeper