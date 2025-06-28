<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Remove Product</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
  </head>
  <body>
       <jsp:include page ="header.jsp"/>
     <div class="text-primary text-center h3 mt-3 mb-3">Order Details</div>
    <div class="container-fluid">
      <div class="table-responsive">
          <table class="table table-hover">
            <thead>
                <tr>
                    <th>Product Image</th>
                    <th>Product Name</th>
                    <th>Order Id</th>
                    <th>Qty</th>
                    <th>Price</th>
                    <th>Time & Date</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><img src="images/pixelm.jpeg" alt="" height="100px" width="100px"></td>
                    <td>IPhone</td>
                    <td>1234</td>
                    <td>2</td>
                    <td>50000</td>
                    <td>24-oct-24 11 am</td>
                    <td>Order Shipped</td>
                </tr>
            </tbody>

          </table>
          </div>
         <jsp:include page ="footer.jsp"/>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

