<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Index</title>
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
    <div class="container">
      <div class="row text-center">
        <div class="col-sm-4">
          <div class="box">
            <img src="images/camera.jpg" alt="" />
            <p class="h5">Nikon DSLR camera</p>
            <p class="text-primary">
              Lorem ipsum dolor sit, amet consectetur adipisicing elit.
              Recusandae excepturi deleniti sapiente, perferendis tempora
              consequatur?
            </p>
            <p class="h6">Rs 500000</p>
            <form action="#">
              <button type="button" class="btn btn-warning">Add to cart</button>
              <button type="button" class="btn btn-primary">Buy Now</button>
              <button type="button" class="btn btn-danger">
                Remove From Cart
              </button>
              <button type="button" class="btn btn-success">Checkout</button>
            </form>
          </div>
        </div>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
    <jsp:include page ="footer.jsp"/>
  </body>
</html>

