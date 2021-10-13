<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="../fragments/header.jsp" />
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <title>XML Parser</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/heroes/">



        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>


        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/heroes.css" rel="stylesheet">
    </head>
<body>
<main>
    <div class="container">

    </div>
    <div class="container col-xxl-8 px-4 py-5">
        <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
            <div class="col-10 col-sm-8 col-lg-6">
                <img src="${pageContext.request.contextPath}/img/xml.png" class="d-block mx-lg-auto img-fluid" alt="Bootstrap Themes" width="700" height="500" loading="lazy">
            </div>
            <div class="col-lg-6">
                <h1 class="display-5 fw-bold lh-1 mb-3">Plant's XML Parser</h1>
                <form method="post" action="${pageContext.request.contextPath}/main"  enctype="multipart/form-data">
                <label class="radio-inline"><input type="radio" name="radios" value="dom" checked>DOM-parser : </label>
                <label class="radio-inline"><input type="radio" name="radios" value="sax">SAX-parser : </label>
                <label class="radio-inline"><input type="radio" name="radios" value="stax">StAX-parser : </label>
                <div class="form-group">
                    <label for="exampleFormControlFile1">Choose file</label>
                    <input type="file" class="form-control-file" name="file" id="exampleFormControlFile1" required>
                </div>
                <button type="submit" class="btn btn-primary">Check</button>
            </form>
            </div>
        </div>
    </div>
    <jsp:include page="../fragments/footer.jsp" />
</main>


<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>


</body>
</html>
