// Función para hacer solicitudes POST al backend (Java)
function calculate(operation) {
    const a = parseInt(document.getElementById('a').value);
    const b = parseInt(document.getElementById('b').value);

    if (isNaN(a) || isNaN(b)) {
        alert('Por favor ingrese dos números válidos.');
        return;
    }

    const data = { a, b };

    fetch(`http://localhost:5095/api/calcular/${operation}`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
    .then(response => {
        if (!response.ok) {
            return response.text().then(error => { throw new Error(error); });
        }
        return response.json();
    })
    .then(result => {
        document.getElementById('result-value').innerText = result;
    })
    .catch(error => {
        console.error('Error al realizar la operación:', error);
        alert('Ocurrió un error: ' + error.message);
    });
}
