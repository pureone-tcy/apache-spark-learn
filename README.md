# aws-emr-spark-application

## Local run (spark-shell)
```
$ cd aws-emr-spark-application
$ sbt assembly
$ export APP_PATH=~/XXX/aws-emr-spark-application/target/scala-2.11/aws-emr-spark-application-assembly-0.0.1.jar
$ ./SPARK_HOME/bin ${APP_PATH}
```

## EMR run
```
$ cd aws-emr-spark-application
$ sbt assembly
$ aws emr create-cluster --name "XXX" \
  --release-label emr-5.25.0 \
  --instance-fleets file://env/emr/resources/fleet-config.json \
  --use-default-roles \
  --applications Name=Spark \
  --configurations file://env/emr/resources/spark-config.json \
  --auto-terminate \
  --log-uri s3://XXX/XXX/ \
  --ec2-attributes SubnetIds=[subnet-XXX,subnet-XXX] \
  --steps Type=Spark,Name="XXX",ActionOnFailure=TERMINATE_CLUSTER,Args=[--class,com.github.pureone.Bootstrap,XXX/spark-sample-app-assembly-0.0.1.jar]
  --tags "Name=XXX"
```
