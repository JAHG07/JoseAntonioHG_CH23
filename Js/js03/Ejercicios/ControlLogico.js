let hora = Number(prompt("indica la hora : "));

if (hora >= 6 && hora <= 11) document.write("Buenos dias");
else if (hora >= 12 && hora <= 18) document.write("Buenas Tardes");
else if (hora >= 19 && hora <= 24) document.write("Buenas Noches");
else if (hora >= 0 && hora <= 5) document.write("Dejame Dormir");
else document.write("Hora no valida");
