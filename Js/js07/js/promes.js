// const myURL = document.URL.toString();
// console.log(myURL);
// const promese = fetch(myURL);
// promese.then(res => console.log(res), e => console.log(e));

//let url = 'https://randomuser.me/api/'
let url = 'https://jsonplaceholder.typicode.com/users/';
fetch(url)
    .then(Response => Response.json())
    .then(data => mostrarData(data))
    .catch(error => console.log(error))

    const mostrarData = (data) => {
        console.log(data)
        let tabl = ""
        for (var i = 0; i < data.length; i++) {      
           tabl+=`<tr>
                    <td>${data[i].id}</td>
                    <td>${data[i].name}</td>
                    <td>${data[i].email}</td>
                </tr>`
        }
        document.getElementById('data').innerHTML = tabl
        
        //console.log(body)
    }