
document.getElementById('customerForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const p = document.getElementById('p1');
    p.innerText = "hi";
    // Define the body data
    const customer = {
        firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        street: document.getElementById('street').value,
        address: document.getElementById('address').value,
        city: document.getElementById('city').value,
        state: document.getElementById('state').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value
    };


    console.log(customer)
      // Define the URL of the API endpoint
      const apiUrl = 'http://localhost:8080/customer/save';

      //Store the token
       const authToken =  "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJTT1VNTyIsImlhdCI6MTcxODE5MDcxOCwiZXhwIjoxNzE4MTk0MzE4fQ.gF4rMMFDVVMAc8tQnPfL2gJbyu1p_k3X0iiUmRsCFiQNjVDl-2QsXI3JRc8qwEJpvyCDEEdKkWHidkicWVuM-w";


      // Define the options for the fetch request
      const requestOptions = {
        method: 'POST', // or 'GET', 'PUT', 'DELETE', etc. depending on your API
        mode: "no-cors",
        headers: {
         'Content-Type': 'application/json', // Specify the content type
             'Authorization': authToken // Include the authentication token in the header
        },
        body: JSON.stringify(customer) // Convert the body data to JSON format
      };

      // Make the fetch request
      fetch(apiUrl, requestOptions)
        .then(response => {
          if (!response.ok) {
            throw new Error('Network response was not ok');
          }
          return response.json(); // Parse the JSON response
        })
        .then(data => {
          // Handle the response data
          console.log(data);
        })
        .catch(error => {
          // Handle any errors
          console.error('There was a problem with the fetch operation:', error);
        });


       // window.location.href = 'home.html';

});