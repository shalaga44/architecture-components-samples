#!/usr/bin/sh
# Copies the master versions.gradle & gradle-wrapper.properties files to each
# project, to make them share the same Dependencies and gradle configurations 

# Search for every Android Studio Project in this Repository 
for line in `find . -name 'gradlew'`

do
	
	# Get projects directory's paths 
  p=$(dirname "${line}");

	# Copy the same dependencies to all project
  echo "Copying versions.gradle -> ${p}";
  cp versions.gradle "$p"

	# Copy the same gradle configurations too
	echo "Copying gradle-wrapper.properties -> ${p}";
	cp gradle-wrapper.properties "$p/gradle/wrapper/."

done
