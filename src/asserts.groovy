def a = true
def b = true
def c = false

assert a
assert a && b
assert a || c
assert !c

//Collections
def myList = [1,2,3]
assert myList

myList = []
assert !myList

def myMap = ['a': 1]
assert myMap

myMap = [:]
assert !myMap

//Matchers
assert ("Hello World =~ /World/")

//Strings
assert 'this is a string'
assert !''

//GStrings
def s = ''
assert !("$s")
s = 's'
assert ("$s")

//Numbers
assert !0
assert 1

//Objects
assert new Object()
assert !null


//Power asserts
def str1 = "this is a string"
def str2 = "this iz a str"

assert str1 == str2