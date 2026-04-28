// // 1. Shopping Cart (let, const, var)
// console.log("1. Shopping Cart");
// const taxRate = 0.1;
// let totalPrice = 0;
// var items = ["Shoes", "Shirt"];

// function addItem(price) {
//     totalPrice += price;
// }
// addItem(100);
// addItem(200);
// console.log("Total with tax:", totalPrice + totalPrice * taxRate);


// // 2. Rectangle Area
// console.log("\n2. Rectangle Area");
// function area(length, width) {
//     return length * width;
// }
// const areaArrow = (length, width) => length * width;

// console.log("Normal:", area(5, 3));
// console.log("Arrow:", areaArrow(5, 3));


// // 3. Book Object
// console.log("\n3. Book Object");
// const book = {
//     title: "Harry Potter",
//     author: "J.K. Rowling",
//     year: 1997,
//     display() {
//         console.log(`${this.title} by ${this.author} (${this.year})`);
//     }
// };
// book.display();


// // 4. Object Destructuring
// console.log("\n4. Object Destructuring");
// const car = {
//     brand: "BMW",
//     model: "X5",
//     year: 2022
// };
// const { brand, model, year } = car;
// console.log(brand, model, year);


// // 5. Array Destructuring
// console.log("\n5. Array Destructuring");
// const numbers = [10, 20, 30];
// const [first, second] = numbers;
// console.log(first, second);


// // 6. map()
// console.log("\n6. map()");
// const names = ["Anu", "Riya", "Rahul"];
// const lengths = names.map(name => name.length);
// console.log(lengths);


// // 7. filter()
// console.log("\n7. filter()");
// const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const even = nums.filter(n => n % 2 === 0);
// console.log(even);


// // 8. reduce()
// console.log("\n8. reduce()");
// const prices = [100, 200, 300];
// const total = prices.reduce((sum, price) => sum + price, 0);
// console.log(total);


// // 9. Rest Operator
// console.log("\n9. Rest Operator");
// function sum(...numbers) {
//     return numbers.reduce((a, b) => a + b, 0);
// }
// console.log(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


// // 10. Spread Operator
// console.log("\n10. Spread Operator");
// const fruits1 = ["Apple", "Banana", "Blueberry"];
// const fruits2 = ["Mango", "Orange", "Kiwi"];
// const allFruits = [...fruits1, ...fruits2];
// console.log(allFruits);


// // 11. Callback with delay
// console.log("\n11. Callback");
// function delayedExecution(callback) {
//     console.log("function started....");
    
//     setTimeout(callback, 2000);
// }
// delayedExecution(() => console.log("Executed after 2 seconds"));


// // 12. Promise
// console.log("\n12. Promise");
// const myPromise = new Promise((resolve) => {
//     console.log("promise started...");
    
//     setTimeout(() => {
//         resolve("Done after 3 seconds");
//     }, 3000);
// });
// myPromise.then(console.log);


// // 13. Closure
// console.log("\n13. Closure");
// function outer() {
//     let count = 0;
//     return function inner() {
//         count++;
//         console.log(count);
//     };
// }
// const counter = outer();
// counter();
// counter();


// // 14. Async/Await API Fetch
// console.log("\n14. Async/Await");
// async function fetchData() {
//     try {
//         const res = await fetch("https://randomuser.me/api/");
//         const data = await res.json();

//         console.log(data);
//     } catch (error) {
//         console.log("Error:", error);
//     }
// }

// fetchData();


// 15. filter + map + reduce
console.log("\n15. Combined");
const numbers2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const result = numbers2
    .filter(n => n % 2 === 0)
    .map(n => n * 2)
    .reduce((sum, n) => sum + n, 0);

console.log(result);