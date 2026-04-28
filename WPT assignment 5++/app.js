async function getCountry() {
    const country = document.getElementById("search").value;
    const result = document.getElementById("result");
    const loader = document.getElementById("loader");

    loader.style.display = "block";
    result.innerHTML = "";

    try {
        const response = await fetch(`https://restcountries.com/v3.1/name/${country}`);

        if (!response.ok) {
            throw new Error("Country not found");
        }

        const data = await response.json();

        loader.style.display = "none";

        result.innerHTML = `
            <div class="card mx-auto" style="width: 18rem;">
                <img src="${data[0].flags.png}" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">${data[0].name.common}</h5>
                    <p class="card-text">Capital: ${data[0].capital}</p>
                    <p class="card-text">Region: ${data[0].region}</p>
                </div>
            </div>
        `;
    } catch (error) {
        loader.style.display = "none";
        result.innerHTML = `<div class="alert alert-danger">${error.message}</div>`;
    }
}