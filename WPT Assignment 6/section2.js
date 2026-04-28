// 1. Variables
let expenses = [];
const list = document.getElementById("list");
var totalDisplay = document.getElementById("total");

// 9. Closure (maintain total)
function createTotal() {
    let total = 0;
    return function(amount) {
        total += amount;
        return total;
    };
}
const updateTotal = createTotal();


// 8. Promise (simulate API)
function fetchExpenses() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve([
                { description: "Food", amount: 50, date: "2026-04-01" },
                { description: "Travel", amount: 30, date: "2026-04-02" }
            ]);
        }, 3000);
    });
}


// 10. Async/Await
async function loadInitial() {
    const data = await fetchExpenses();
    expenses = data;
    displayExpenses(expenses);
}
loadInitial();


// 2. Add Expense (uses spread)
function addExpense(exp) {
    expenses = [...expenses, exp];
}


// 7. Callback
function addWithCallback(exp, callback) {
    addExpense(exp);
    callback();
}


// 2. Handle Add (arrow function used)
const handleAdd = () => {
    const desc = document.getElementById("desc").value;
    const amount = Number(document.getElementById("amount").value);
    const date = document.getElementById("date").value;

    const newExpense = { description: desc, amount, date };

    addWithCallback(newExpense, () => {
        alert("Expense added successfully!");
        displayExpenses(expenses);
    });
};


// 4. Destructuring + display
function displayExpenses(data) {
    list.innerHTML = "";

    data.forEach(item => {
        const { description, amount, date } = item;

        list.innerHTML += `
            <li class="list-group-item">
                ${description} - ₹${amount} - ${date}
            </li>
        `;
    });

    // 5. reduce
    const total = data.reduce((sum, e) => sum + e.amount, 0);
    totalDisplay.innerText = "Total: ₹" + total;
}


// 5. map
function showDescriptions() {
    const desc = expenses.map(e => e.description);
    alert(desc.join(", "));
}


// 5. filter
function showAbove20() {
    const filtered = expenses.filter(e => e.amount > 20);
    displayExpenses(filtered);
}


// show all
function showAll() {
    displayExpenses(expenses);
}


// 6. Rest operator (add multiple)
function addMultiple(...newExpenses) {
    expenses = [...expenses, ...newExpenses];
}