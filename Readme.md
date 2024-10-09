#command
java -XX:+FlightRecorder -XX:StartFlightRecording=settings=profile,duration=60s,filename=myrecording.jfr JFRDemo

#show
jfr print --events myrecording.jfr

#summary
jfr summary myrecording.jfr

#export to csv
jfr export --events --csv myrecording.jfr

#
jcmd <pid> JFR.start settings=/path/to/custom.jfc