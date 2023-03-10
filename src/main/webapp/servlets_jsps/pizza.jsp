<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/9/23
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza</title>
    <%@ include file="/partials/head.jsp" %>

</head>
<body>

<div class="container-fluid">

    <h3>Welcome to PizzaLand!</h3>

    <form action="/pizza-order" method="post">

        <label for="crust_type" class="form-label">Crust</label>
        <select id="crust_type" name="crust_type" class="form-select" aria-label="Default select example">
            <option selected value="thin">Thin</option>
            <option value="pan">Pan</option>
        </select>

        <label for="sauce_type" class="form-label">Sauce</label>
        <select id="sauce_type" name="sauce_type" class="form-select" aria-label="Default select example">
            <option selected value="tomato">Tomato</option>
            <option value="not-tomato">Not Tomato</option>
        </select>

        <label for="size_type" class="form-label">Size</label>
        <select id="size_type" name="size_type" class="form-select" aria-label="Default select example">
            <option selected value="big">Big</option>
            <option value="bigger">Bigger</option>
        </select>

        <h4>Toppings</h4>
        <div class="form-check">
            <input id="pepperoni" name="pepperoni" class="form-check-input" type="checkbox" value="">
            <label for="pepperoni" class="form-check-label">
                Pepperoni
            </label>
        </div>

        <div class="form-check">
            <input id="cheese" name="cheese" class="form-check-input" type="checkbox" value="">
            <label for="cheese" class="form-check-label">
                Extra cheese
            </label>
        </div>

        <div class="form-check">
            <input id="potato" name="potato" class="form-check-input" type="checkbox" value="">
            <label for="potato" class="form-check-label">
                Potato
            </label>
        </div>

        <div class="form-check">
            <input id="fish" name="fish" class="form-check-input" type="checkbox" value="">
            <label for="fish" class="form-check-label">
                Fish
            </label>
        </div>

        <div class="form-check">
            <input id="hamster" name="hamster" class="form-check-input" type="checkbox" value="">
            <label for="hamster" class="form-check-label">
                Hamster
            </label>
        </div>


        <label for="address" class="form-label">Address Info</label>
        <textarea id="address" name="address" class="form-control"></textarea>

        <button type="submit" class="mt-2 btn-primary">Order!</button>
    </form>

</div>

<%@ include file="/partials/foot.jsp" %>

</body>
</html>
