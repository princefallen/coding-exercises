To compile this program, use mvn install in the same directory as the pom.xml from the CLI of your choice.
It will output a target directory with example-1.jar inside.

To run this program, use java -jar example-1.jar in the same directory as the .jar.

Given a string, it should output each word in the text and the number of times it occurred. 
The words should be sorted by frequency, in descending order.
Words with the same frequency can be in any order.

Arguments can be given like so: java -jar example.jar "the cat is in the bag"

For example if given the input “the cat is in the bag”, output should be:
2 the
1 cat
1 is
1 in
1 bag

