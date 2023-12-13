const express = require('express');
const mysql = require('mysql');

const app = express();
const port = 3000;

const connection = mysql.createConnection({
  host: 'localhost',
  user: 'admin',
  password: 'admin123',
  database: 'swiftDB'
});

connection.connect();

app.get('/obtener-datos', (req, res) => {
  const sql = 'SELECT mes_Ingreso, SUM(monto) AS monto_total FROM swiftdb.presupuesto GROUP BY mes_Ingreso;';
  
  connection.query(sql, (error, results) => {
    if (error) {
      res.status(500).send('Error en el servidor');
      throw error;
    }
    res.json(results);
    console.log(results);
  });
});

app.listen(port, () => {
  console.log(`Servidor escuchando en http://localhost:${port}`);
});