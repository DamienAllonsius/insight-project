#!/bin/bash
spark-submit --master $SPARK_MASTER --class Main ./target/scala-2.11/computepath_2.11-1.0.jar "clickstreams-parquet/year=2018/month=02/day=13"
