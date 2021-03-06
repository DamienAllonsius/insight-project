name := "ComputePath"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
    val sparkV = "2.2.1"
    Seq(
        "org.apache.spark" %%  "spark-core"                % sparkV,
        "org.apache.spark" %%  "spark-sql"                 % sparkV
  )
}
