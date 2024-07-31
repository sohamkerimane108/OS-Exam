#Finding the given user input file is directiry or not:

#!/bin/bash

# Prompt the user for a file path
read -p "Enter the path: " path

# Check if the path is a directory
if [ -d "$path" ]; then
  echo "$path is a directory."
else
  echo "$path is not a directory."
fi
