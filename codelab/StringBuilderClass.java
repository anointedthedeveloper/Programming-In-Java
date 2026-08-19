package codelab;
public class StringBuilderClass {
    public static void main(String[] Optional.ofNullable(args) {
            //PRT1:STRINGBUILDER
            //
            //StringBuilder is used when we need to change a string
            //several times without creating many new
            //
            //We will practice:
            //append()
            //insert()
            //delete()
            //reverse()
    
            System.out.println("PART1:STRINGBUILDER____");
            //Create a StringBuilder object containing "JAVA".
            StringBuilder str = new StringBuilder("JAVA");
            System.out.println("Original:" + str);
    
            //1: append()
            //append() adds something to the END of the StringBuilder.
            //
            //Example:
            //str.append(" SE");
            //
            //After this statement:
            //JAVA becomes JAVA SE
            //
    
            str.append(" SE");
            System.out.println("After append(): " + str);
    
            //
            //3: append() another value
            //
            //Lets add "7" to the end of the StringBuilder.
            str.append("7");
            System.out.println("After second append(): " + str);
    
            //
            //3: insert()
            //insert() adds something to the StringBuilder at a specific index.
            //
            //JAVA indexes start at 0
            //
            //J A V A
            //0 1 2 3
            //
            //try inserting "!" at index 9.
            //
    
            str.insert(9, "!");
            System.out.println("After insert(): " + str);
            //
            //4: delete()
            //
            //delete() removes a character or characters from the StringBuilder.
            //delete(startIndex, endIndex)
            //
            //IMPORTANT: The character at the endIndex is NOT deleted.
            //
            //For example:
            //str.delete(4, 7);
            //
            //This removes characters at indexes:
            //4, 5, and 6.
            //
    
            str.delete(9, 10);
            System.out.println("After delete(): " + str);
    
            //
            //5: reverse()
            //
            //reverse() reverses the order of the characters in the StringBuilder.
            //
            //Example:
            //JAVA SE 7
            //
            //becomes:
            //7 ES AVAJ
            //
            str.reverse();
            System.out.println("After reverse(): " + str);
    
            //PARDT2:STRING ARRAYS
            //
            
            System.out.println("PART2:STRING ARRAYS____");
            //
            //1: Create a String array of 5 elements.
            //
            //this array will hold 5 strings.
            //
            //
            //indexes:
            //0       1        2           3          4
            //java, python, c++, c#, javascript
            //
            String[] languages = {
                "java", "python", "c++", "c#", "javascript"
            };
            //
            //
            System.out.println("First language: " + languages[0]);
            System.out.println("Second language: " + languages[1]);

            languages[2] = "C"; //change the value at index 2
            System.out.println("Updated third language: " + languages[2]);

            System.out.println("\nAll languages:");
            for (int i = 0; i < languages.length; i++) {
                System.out.println("index " + i + ": " + languages[i]);
            }

            //
            //5:Enhanced for loop
            //
            System.out.println("\nAll languages using enhanced for loop:");
            for (String language : languages) {
                System.out.println(language);
            }

            //PART3:STRING ARRAY + STRINGBUILDER

            //
            //Now lets combine the  two concepts
            //
            //We will create a String array of 5 elements and use StringBuilder to manipulate the strings.



            System.out.println("\nPART3:STRING ARRAY + STRINGBUILDER____");
            StringBuilder courseList = new StringBuilder();
            for (String language : languages) {
                courseList.append(language).append(", ");
                courseList.append(" ,"); // Add a space after each language

            }
            System.out.println("Course List: " + courseList.toString());
            //
            //LAB CHALLENGE:
            //
            //
            //1: Create a String array of 5 elements.
            //
            courseList.delete(courseList.length() - 2, courseList.length()); // Remove the last comma and space
            System.out.println("Course List after removing last comma: " + courseList.toString());

            





















































    }
}
