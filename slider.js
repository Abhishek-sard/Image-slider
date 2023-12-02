const myMap = new Map();

myMap.set("name", "John");
myMap.set("age", 30);
myMap.set("isStudent", false);

console.log(myMap.get("name")); // Output: John
console.log(myMap.has("age"));  // Output: true

for (const [key, value] of myMap) {
  console.log(key, value);
}

myMap.delete("age");
console.log(myMap.has("age")); // Output: false

console.log(myMap.size); // Output: 2
myMap.clear();
console.log(myMap.size); // Output: 0

