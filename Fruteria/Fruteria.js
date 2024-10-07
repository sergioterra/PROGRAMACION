let carrito = {};
let totalKilos = 0;
let totalDinero = 0;

document.querySelectorAll('.fruta-imagen').forEach(img => {
    img.addEventListener('click', () => {
        const fruta = img.parentElement;
        const nombreFruta = fruta.getAttribute('data-nombre');
        const precioFruta = parseFloat(fruta.getAttribute('data-precio'));

        // Añadir fruta al carrito
        if (!carrito[nombreFruta]) {
            carrito[nombreFruta] = { kilos: 0, precio: precioFruta };
        }
        carrito[nombreFruta].kilos += 1;
        totalKilos += 1;
        totalDinero += precioFruta;

        console.log(carrito);
    });
});

document.getElementById('finalizar-compra').addEventListener('click', () => {
    // Limpiar el resumen anterior
    const resumenDiv = document.getElementById('resumen-compra');
    resumenDiv.innerHTML = '';

    // Ordenar las frutas alfabéticamente en orden inverso
    const frutasOrdenadas = Object.keys(carrito).sort((a, b) => b.localeCompare(a));

    // Mostrar las frutas y kilos
    frutasOrdenadas.forEach(fruta => {
        resumenDiv.innerHTML += `<p>${fruta} ---- ${carrito[fruta].kilos} kilos</p>`;
    });

    // Mostrar el precio total
    resumenDiv.innerHTML += `<hr>`;
    resumenDiv.innerHTML += `<p>Precio total: ${totalDinero.toFixed(2)} €</p>`;

    // Mostrar el precio medio por kilo
    const precioMedio = totalDinero / totalKilos;
    resumenDiv.innerHTML += `<p>Precio medio: ${precioMedio.toFixed(2)} €/kg</p>`;

    // Reiniciar carrito y totales después de la compra
    carrito = {};
    totalKilos = 0;
    totalDinero = 0;
});
