def myList = []
myList = [2014, 1, 2, -9, 0, 8987987987]
myList2 = [5,6,7,8]
myList.addAll(myList2)

println myList[0]

println myList.size()

myList.add("a string")
println myList

def myMap = [:]
myMap = ["name": "Doug", "age": 37, "favNumber": 87.13 ]
println myMap.name
println myMap["age"]
println myMap.favNumber

myMap.favNumber = 13
println myMap.favNumber

