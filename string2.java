
public class string2 {

    public static void main(String[] args) {
        // string : a string is a sequence of character used to store and manipulate text. in java string is a class that is used to create and manipulate string objects. string is immutable in java which means once a string object is created it cannot be changed.

        // string is one of the most fundamental data type in java and it is the part of java.Lang package . which is automatically imported in every java program. 

        // one thing most important in string is part of or advanced of character array but it is more powerful than character array because it has many built in methods that can be used to manipulate string objects. 

        // creation of string object : there are two ways to create string object in java

        // 1. string litteral
        // 2. new keyword    



        // 1. using string literal : when we create a string object using string literal then java automatically creates a string object in string pool and returns the reference of that object. string pool is a special memory or heap memory area in java that is used to store string literals. 
        
        //java me ek heap memory and stack memery hoti h and jab aap string literal used krte ho to ek special memory area hota h jiska naam h string pool aur jab aap string literal used krte ho to java automatically string object create krta h string pool me aur stack memory me reference store hota h aur heap memory me object store hota h  jisme aapka variable str store hota h aur usme string object ka reference store hota h.

// string pool or constant pool  : string pool is a special memory area in java that is used to store string literals. when we create a string object using string literal then java automatically creates a string object in string pool and returns the reference of that object. when we create a string object using string literal then java checks if there is already a string object with the same value in string pool if there is then it returns the reference of that object if there is not then it creates a new string object in string pool and returns the reference of that object.

// example str = "hello jii"  yaha pr str reference variable hai aur "hello jii" string literal ya exact values hai so reference store hoga stack memroy me aur string object store hoga heap memory  ke ander string pool me .

 // str1 = "hello jii"  yaha pr  reference different h but exact values same h to ye dono ek hi string object ko refer karenge kyuki java check krta h ki is string literal ke same value ka string object already string pool me exist krta h ya nhi agar exist krta h to uska reference return krta h aur agar exist nhi krta h to naya string object create krta h string pool me aur uska reference return krta h 

 // if i write str1 ="world" then str1 hello jii ko refer nhi karega balki world ko refer karega kyuki str1 me world assign kar diya h to str1 world ko refer karega aur str world ko refer karega kyuki str me hello jii assign kiya h to str hello jii ko refer karega 

 // and jab koi bhi reference kisi bhi values ko refer nhi karta h then garbage collector us object ko remove kar deta h memory se jise garbage collection kehte h




        
 

        // String str = "Hello World"; // this is string literal it creates a string object in string pool and returns the reference of that object to str1 variable  
     
    
    // 2. using new keyword : when we create a string object using new keyword then java creates a string object in heap memory and returns the reference of that object. when we create a string object using new keyword then java does not check if there is already a string object with the same value in string pool it just creates a new string object in heap memory and returns the reference of that object. 
    
    
    // String str1 = new String("Hello World"); // this is using new keyword it creates a string object in heap memory and returns the reference of that object to str1 variable  // basically new keyword is used to create a new object in java and it is used to create a new string object 
    
    // same like aap scanner create karte the tab used krte the like Scanner sc = new Scanner(system.in) isme bhi new keyword used htoa h 
    
   // String name  = new String("anup"); // ye bhi exact value heap memory me hi store hoga but ye string pool ya heap memory ke ander special area me store nhi hoga uske bahar store hoga name stack memory me referrenc h ye and object heap  memory me bahar store hoga 

   // String name1 = new String("anup"); // ye bhi exact value heap memory me hi store hoga but ye pahle wale anup ya object value ko refer nhi karega balki ye heap memory me dusre jagah store karega and iska address bhi dusra hoga 

   // Lets write code 

//    String name = "anup ";   // for string literal 
//    System.out.println(name);


//  String name1 = new String("kumar"); // for new keyword
//  System.out.println(name1);

// System.out.println(name + "" + name1);    // string concatenation : 2 string ko jodna ya concatenate karna whi aap + ka sign ka used integer me used krte h to wah addtion karega but string me used krte h to string concatenation karega ya 2 string ko jod dega 


// Immutable string : string is immutable in java which means once a string object is created it cannot be changed. when we create a string object using string literal or new keyword then java creates a string object in memory and returns the reference of that object to the variable but if we try to change the value of that variable then java creates a new string object in memory and returns the reference of that new object to the variable and the old string object remains unchanged in memory.

// example   
//    String name = "anup"; 
//    name = "Kumar";
//    System.out.println(name);  // its not change anup into kumar but it create a new string object in memory and returns the reference of that new object to the variable name and the old string object "anup" remains unchanged in memory. so when we print name it will print kumar because name variable is now referring to the new string object "kumar" and not the old string object "anup" 

   // Comparing string in java 

   //1.  == operator : when we use == operator to compare two string objects then it[ compares the reference equality] of those objects and not the value of those objects. if both string objects are referring to the same object in memory then it will return true otherwise it will return false.

   // example 
    // String str1 = "hello";
    // String str2 = "hello";
    // String str3 = new String("hello");

    // if(str1 == str2){ // why its show equal because str1 and str2 are referring to the same object in memory which is created by string literal "hello" in string pool so it will return true

    // if(str1 == str3){ // why its show not equal because str1 is referring to the string object created by string literal "hello" in string pool and str3 is referring to the string object created by new keyword in heap memory so it will return false and ye string pool ke bahar create hua a aur == reference ko dekhta h so ye different object ko refer kr rha h to ye false return krta h
    //     System.out.println("Strings are equal ");  //
    // }else{  
    //     System.out.println("string are not equal");

    // }

//2.   .equals() method : when we use equals() method to compare two string objects then it [compares the value] of those objects and not the reference of those objects. if both string objects have the same value then it will return true otherwise it will return false.

// example
    // if(str1.equals(str3)){ // why its show equal because str1 and str3 have the same value "hello" so it will return true and ye .equals() method value ko dekhta h to ye true return krta h
    //     System.out.println("Strings are equal ");   

    // } else{  
    //     System.out.println("string are not equal");
   

// 3. .equalsIgnoreCase() method : when we use equalsIgnoreCase() method to compare two string objects then it compares the value of those objects and ignores the case of those objects. if both string objects have the same value ignoring the case then it will return true otherwise it will return false.

    // String str4 = "HELLO";
    // if(str1.equalsIgnoreCase(str4)){ // why its show equal because str1 and str4 have the same value "hello" ignoring the case so it will return true and ye .equalsIgnoreCase() method value ko dekhta h aur case ko ignore krta h to ye true return krta h
    //     System.out.println("Strings are equal ");   

    // } else{  
    //     System.out.println("string are not equal");}

        // string input : we can take string input from the user using Scanner class in java. we can use nextLine() method of Scanner class to take string input from the user. nextLine() method reads the entire line of input including spaces and returns it as a string.

        // there are two ways to take string input from the user using Scanner class in java
        // 1. using next() method : when we use next() method to take string input from the user then it reads the input until the first space and returns  it                                  as a string. if we want to take multiple words as input then we can use nextLine() method instead of next() method.

        //example you name is : Anup KUmar singh so next method will read only Anup and it will return "Anup" as a string and if we want to take the entire line of input then we can use nextLine() method instead of next() method.

        // 2. using nextLine() method : when we use nextLine() method to take string input from the user then it reads the entire line of input including spaces and returns it as a string. if we want to take multiple words as input then we can use nextLine() method instead of next() method.

        // example you name is : Anup KUmar singh so nextLine method will read the entire line of input including spaces and it will return "Anup Kumar Singh" as a string and if we want to take only the first word as input then we can use next() method instead of nextLine() method.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your first name : ");
        // String name = sc.nextLine(); // this will read the entire line of input including spaces
        // System.out.println("Your name is : " + name);
        // System.out.println("Enter your last name : ");
        // String name1 = sc.next(); // this will read the input until the first space
        // System.out.println("Your name is : " + name1);  

// java string methods : java string class has many built in methods that can be used to manipulate string objects. some of the commonly used string methods are : length(), charAt(), substring(), indexOf(), lastIndexOf(), toUpperCase(), toLowerCase(), trim(), replace(), equals(), equalsIgnoreCase() etc.

//1. .length() method : returns the length of the string. it returns the number of characters in the string including spaces.

    //  String str = "Hello World";
    //  System.out.println("Length of the string is : " + str.length()); // this will return 11 because there are 11 characters in the string including spaces

// 2.  .charAt() method or charAt(int index ) : returns the character at the specified index in the string. the index starts from 0. if we try to access the character at an index that is out of bounds then it will throw StringIndexOutOfBoundsException.

    //  System.out.println("Character at index 0 is : " + str.charAt(0)); // this will return H because H is the character at index 0 in the string
    //  System.out.println("Character at index 6 is : " + str.charAt(6)); // this will return W because W is the character at index 6 in the string
     //System.out.println("Character at index 11 is : " + str.charAt(11)); // this will throw StringIndexOutOfBoundsException because there is no character at index 11 in the string  

// 3. .substring() method or substring(int beginIndex,int endIndex) : returns the substring of the string from the specified beginIndex to the specified endIndex. the beginIndex is inclusive and the endIndex is exclusive. if we try to access the substring with an index that is out of bounds then it will throw StringIndexOutOfBoundsException.

   // inclusive means that the character at the beginIndex will be included in the substring and (str.substring(0,4)) 0 inclusive h isko carry karenge 
   //  exclusive means that the character at the endIndex will not be included in the substring. (str.substring(0,4)) 4 exclusive h isko carry nhi karenge to ye 0 se 3 tak ke character ko return karega to ye Hell return karega




    //  System.out.println("Substring from index 0 to 5 is : " + str.substring(0, 5)); // this will return Hello because Hello is the substring from index 0 to 5 in the string n-1 tak chalta h to ye 5-1 tak chalega to ye Hello return karega
    //  System.out.println("Substring from index 6 to 11 is : " + str.substring(6, 11)); // this will return World because World is the substring from index 6 to 11 in the string
     //System.out.println("Substring from index 0 to 12 is : " + str.substring(0, 12)); // this will throw StringIndexOutOfBoundsException because there is no character at index 12 in the string

    // System.out.println("substring is :"+ str.substring(6)); // iska matlab 6 beginIndex hai 6 se start hoga aur endIndex string ke end tak hoga to ye World return karega

//4.  .contains() method or .contains(CharSequence s): returns true if the string contains the specified sequence of char values otherwise it returns false.

    // System.out.println("Does the string contain 'Hello' ? " + str.contains("Hello")); // this will return true because the string contains the sequence of char values "Hello"
    // System.out.println("Does the string contain 'hello' ? " + str.contains("hello")); // this will return false because the string does not contain the sequence of char values "hello" because it is case sensitive
    
    // another example 

    // String str1 = "this is a java string method";
    // System.out.println("Does the string contain 'java' ?" + str1.contains("mutable")); // falsee return karega because mutable not found in string str1

// 5. .equals() method or .equals(Object anObject) : returns true if the string is equal to the specified object otherwise it returns false. the equals() method compares the value of the string and not the reference of the string.

    // String str2 = "Hello World";
    // System.out.println("Is str equal to str2 ? " + str.equals(str2)); // this will return true because str and str2 have the same value "Hello World"
    // System.out.println("Is str equal to str1 ? " + str.equals(str1)); // this will return false because str and str1 do not have the same value "Hello World"


//6  .equalsIgnoreCase() method or .equalsIgnoreCase(String anotherString) : returns true if the string is equal to the specified string ignoring case otherwise it returns false. the equalsIgnoreCase() method compares the value of the string and ignores the case of the string.

    // String str3 = "hello world";
    // System.out.println("Is str equal to str3 ? " + str.equalsIgnoreCase(str3)); // this will return true because str and str3 have the same value "Hello World" ignoring case
    // System.out.println("Is str1 equal to str3 ? " + str1.equalsIgnoreCase(str3)); // this will return false because str1 and str3 do not have the same value "this is a java string method" ignoring case   


// 7. .indexOf() method or .indexOf(String str) : returns the index of the first occurrence of the specified substring in the string. if the substring is not found in the string then it returns -1.
    //     String str = "Hello World"; 
    // System.out.println("Index of 'World' in str is : " + str.indexOf("World")); // this will return 6 because the index of the first occurrence of the substring "World" in the string is 6
    // System.out.println("Index of 'Java' in str is : " + str.indexOf("Java")); // this will return -1 because the substring "Java" is not found in the string

//8. .lastIndexOf() method or .lastIndexOf(String str) : returns the index of the last occurrence of the specified substring in the string. if the substring is not found in the string then it returns -1.

    // System.out.println("Last index of 'o' in str is : " + str.lastIndexOf("o")); // this will return 7 because the index of the last occurrence of the substring "o" in the string is 7
    // System.out.println("Last index of 'Java' in str is : " + str.lastIndexOf("Java")); // this will return -1 because the substring "Java" is not found in the string

// 9. .toUpperCase() method or .toUpperCase() : returns a new string with all the characters in the string converted to uppercase.

    // System.out.println("String in uppercase is : " + str.toUpperCase()); // this will return "HELLO WORLD" because all the characters in the string are converted to uppercase


// 10. .toLowerCase() method or .toLowerCase() : returns a new string with all the characters in the string converted to lowercase.

    // System.out.println("String in lowercase is : " + str.toLowerCase()); // this will return "hello world" because all the characters in the string are converted to lowercase

// 11. .trim() method or .trim() : returns a new string or copy of the string with all the leading and trailing whitespace removed from the string.

    // String str1 = "   Hello World   ";
    // System.out.println("String after trim is : " + str1.trim()); // this will return "Hello World" because all the leading and trailing whitespace is removed from the string

    // String data = "         java            ";
    // System.out.println(data.trim());  // ye white space ko remove kar deta h 







// 12. .replace() method or .replace(CharSequence target, CharSequence replacement) : returns a new string resulting from replacing all occurrences of the target sequence of char values in the string with the specified replacement sequence of char values.

    // System.out.println("String after replace is : " + str.replace("World", "Java")); // this will return "Hello Java" because all the occurrences of the target sequence of char values "World" in the string is replaced with the specified replacement sequence of char values "Java"


//13.  .split() method or .split(String regex) : returns an array of strings computed by splitting the string around matches of the given regular expression.

    // String str2 = "Hello World Java String";
    // String[] arr = str2.split(" "); // this will split the string into an array of strings using space as a delimiter
    // System.out.println("Array of strings after split is : ");
    // for(String s : arr){
    //     System.out.println(s); // this will print each string in the array on a new line
    // }


  // another exaple is : 

//   String st = "This ,is,my,data,your,data,java";
//   String [] dataa = st.split(","); // iska mtlb aap split ka used kr ke kisi sentence mese koi specific ya values ko print kara skate ho based on condition . 

//   for(String s : dataa){
//     System.out.println(s);
//   }

// 14. .startsWith() method or .startsWith(String prefix) : returns true if the string starts with the specified prefix otherwise it returns false.

    // System.out.println("Does the string start with 'Hello' ? " + str.startsWith("Hello")); // this will return true because the string starts with the specified prefix "Hello"
    // System.out.println("Does the string start with 'World' ? " + str.startsWith("World")); // this will return false because the string does not start with the specified prefix "World"

// 15. .endsWith() method or .endsWith(String suffix) : returns true if the string ends with the specified suffix otherwise it returns false.

    // System.out.println("Does the string end with 'World' ? " + str.endsWith("World")); // this will return true because the string ends with the specified suffix "World"
    // System.out.println("Does the string end with 'Hello' ? " + str.endsWith("Hello")); // this will return false because the string does not end with the specified suffix "Hello"  


// 16. .isEmpty() method or .isEmpty() : returns true if the string is empty otherwise it returns false. a string is considered empty if it has no characters in it.

    // String str2 = "";  agar is space me "   " aap space de dete ho to ye empty nhi hoga balki ye blank hoga kyuki isme whitespace character hoga to ye empty nhi hoga balki blank hoga  but agar aap is space me kuch bhi nhi dete ho to ye empty hoga kyuki isme koi character nhi hoga to ye empty return karega
    // System.out.println("Is the string empty ? " + str2.isEmpty()); // this will return true because the string is empty
    // System.out.println("Is the string str empty ? " + str.isEmpty()); // this will return false because the string str is not empty it has characters in it

// 17. .isBlank() method or .isBlank() : returns true if the string is empty or contains only whitespace characters otherwise it returns false. a string is considered blank if it has no characters in it or if it contains only whitespace characters.

    // String str3 = "   ";
    // System.out.println("Is the string blank ? " + str3.isBlank()); // this will return true because the string is blank it contains only whitespace characters
    // System.out.println("Is the string str blank ? " + str.isBlank()); // this will return false because the string str is not blank it has characters in it and it does not contain only whitespace characters

// 18. .compareTo() method or .compareTo(String anotherString) : compares the string with the specified string lexicographically. it returns a negative integer if the string is lexicographically less than the specified string, it returns a positive integer if the string is lexicographically greater than the specified string and it returns 0 if the string is equal to the specified string.

    // String str4 = "Hello World";
    // System.out.println("Comparing str with str4 : " + str.compareTo(str4)); // this will return 0 because str and str4 are equal
    // System.out.println("Comparing str with str1 : " + str.compareTo(str1)); // this will return a positive integer because str is lexicographically greater than str1
    // System.out.println("Comparing str1 with str : " + str1.compareTo(str)); // this will return a negative integer because str1 is lexicographically less than str  


// 19. .compareToIgnoreCase() method or .compareToIgnoreCase(String str) : compares the string with the specified string lexicographically ignoring case considerations. it returns a negative integer if the string is lexicographically less than the specified string, it returns a positive integer if the string is lexicographically greater than the specified string and it returns 0 if the string is equal to the specified string ignoring case considerations.

    // String str5 = "hello world";
    // System.out.println("Comparing str with str5 ignoring case : " + str.compareToIgnoreCase(str5)); // this will return 0 because str and str5 are equal ignoring case considerations
    // System.out.println("Comparing str1 with str5 ignoring case : " + str1.compareToIgnoreCase(str5)); // this will return a positive integer because str1 is lexicographically greater than str5 ignoring case considerations
    // System.out.println("Comparing str5 with str1 ignoring case : " + str5.compareToIgnoreCase(str1)); // this will return a negative integer because str5 is lexicographically less than str1 ignoring case considerations      

// 20. .valueOf() method or .valueOf(any types ) : convert different data types (int, float, double, boolean, char etc) into string. it returns the string representation of the specified data type.

    int num = 10;
    String str6 = String.valueOf(num); // this will convert the integer num into a string and return the string representation of num
    System.out.println("String representation of num is : " + str6); // this will print "String representation of num is : 10" because str6 is the string representation of num
   // apko check karna h ki ye values string h ya integer so then 
   System.out.println(num +1); // this will print 11 because num is an integer and it will perform addition operation
   System.out.println(str6 + 1); // this will print "101" because str6 is a string and it will perform string concatenation operation.


// replece method ka used aap character ki tarah bhi kar sakte h aur old char ko new char me replace kar sakte h 

 String strq = "Hello World"; 
 strq = strq.replace('H','P');
    System.out.println(strq); // this will print "Pello World" because all the occurrences of the old char 'H' in the string is replaced with the new char 'P'



//21. .toCharArray() method or .toCharArray() : converts the string into a new character array. it returns a new character array containing the characters of the string.

    String str7 = "Hello";
    char[] charArray = str7.toCharArray(); // this will convert the string str7 into a new character array and return the new character array
    System.out.println("Character array after converting string is : ");
    for(char c : charArray){
        System.out.println(c);} // this will print each character in the character array on a new line










}
    
    }
