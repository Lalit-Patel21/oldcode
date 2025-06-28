<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Register</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
  </head>
  <body>
        <jsp:include page ="header.jsp"/>
    <div class="container mt-5 mb-5">
      <div class="row justify-content-center">
        <form action="#" class="col-md-6 myform">
          <div class="text-center mt-3">
            <h2 class="text-primary">Registration Form</h2>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="user_name">Name</label>
              <input type="text" name="" class="form-control" id="user_name" />
            </div>

            <div class="col-md-6 form-group">
              <label for="user_email">Email</label>
              <input type="text" name="" class="form-control" id="user_email" />
            </div>
          </div>

          <div class="form-group">
            <label for="address">Address </label>
            <textarea name="" id="address" class="form-control"></textarea>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="mobile">Mobile No.</label>
              <input type="number" name="" class="form-control" id="mobile" />
            </div>

            <div class="col-md-6 form-group">
              <label for="pincode">Pincode</label>
              <input type="number" name="" class="form-control" id="pincode" />
            </div>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="password">Password</label>
              <input
                type="password"
                name=""
                class="form-control"
                id="password"
              />
            </div>

            <div class="col-md-6 form-group">
              <label for="cpassword">Confirm Password</label>
              <input
                type="password"
                name=""
                class="form-control"
                id="cpassword"
              />
            </div>
          </div>

          <div class="row mt-3 mb-3 text-center">
            <div class="col-md-6">
              <button type="button" class="btn btn-danger">Reset</button>
            </div>

            <div class="col-md-6">
              <button type="button" class="btn btn-primary">Register</button>
            </div>
          </div>
        </form>
      </div>
    </div>
    <jsp:include page ="footer.jsp"/>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

