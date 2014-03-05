import java.util.regex.Pattern

Pattern myPattern = ~/\p{Digit}{1,3}-\p{Digit}{1,2}-\p{Digit}{1,4}/

def var = "1-2-2"

var.matches(myPattern)

