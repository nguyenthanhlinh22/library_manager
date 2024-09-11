<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tạo mới phòng trọ</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="my-4">Tạo mới phòng trọ</h1>

    <form action="${pageContext.request.contextPath}/rooms/create" method="post">
        <div class="form-group">
            <label for="tenantName">Tên người thuê:</label>
            <input type="text" id="tenantName" name="tenantName" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="phoneNumber">Số điện thoại:</label>
            <input type="text" id="phoneNumber" name="phoneNumber" class="form-control" pattern="\d{10}" title="Số điện thoại phải gồm 10 ký tự số" required>
        </div>
        <div class="form-group">
            <label for="startDate">Ngày bắt đầu thuê:</label>
            <input type="date" id="startDate" name="startDate" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="paymentType">Hình thức thanh toán:</label>
            <select id="paymentType" name="paymentType" class="form-control" required>
                <option value="1">Theo tháng</option>
                <option value="2">Theo quý</option>
                <option value="3">Theo năm</option>
            </select>
        </div>
        <div class="form-group">
            <label for="notes">Ghi chú:</label>
            <textarea id="notes" name="notes" class="form-control" maxlength="200"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Tạo mới</button>
        <a href="${pageContext.request.contextPath}/rooms" class="btn btn-secondary">Hủy</a>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
