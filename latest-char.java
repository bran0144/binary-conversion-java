String s = "The quick brown fox jumps over the lazy dog.";
String lower = s.toLowerCase();
char latest = ' ';
char c;
for(int i = 0; i < lower.length(); i++) {
    c = lower.charAt(i);
    if(c >= 'a' && c <= 'z' && c > latest)
        latest = c;
}
System.out.println("The latest character in the alphabet from your message is: '"
    + latest + "'.");
    

// For loop rewritten to end when z is found, to prevent unnecessary looping
for(int i = 0; i < lower.length(); i++) {
    c = lower.charAt(i);
    if(c >= 'a' && c <= 'z' && c > latest)
        latest = c;
    if(latest == 'z')
        break;
}