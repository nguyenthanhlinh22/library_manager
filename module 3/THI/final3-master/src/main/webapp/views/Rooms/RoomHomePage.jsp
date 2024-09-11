<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/commons/taglib.jsp"%>
<html>
<head>
    <title>Phòng trọ</title>
</head>
<body>
    <!-- Trigger the modal with a button -->
    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#add">Thêm phòng</button>

    <!-- Modal -->
    <div id="add" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-body">
                    <div class="row ml-4 mt-4">
                        <form class="form-horizontal col-12" role="form" method="POST" id="formSubmit" enctype="multipart/form-data">
                            <input name="id" type="hidden">
                            <div class="form-group">
                                <div class="col-12">
                                    <label for="customerName" class="col-3">Tên khách</label>
                                    <input id="customerName" type="text" name="customerName" class="col-12""/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-12">
                                    <label for="note" class="col-3">Ghi chú</label>
                                    <textarea id="note" type="note" name="note" class="col-12" rows="7" ></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-12">
                                    <label for="price" class="col-3">Ngày bắt đầu</label>
                                    <input id="price" type="date" name="price" class="col-12""/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-12">
                                    <label for="paymentMethod">Cách thanh toán</label>
                                    <select name="paymentMethod" id="paymentMethod">
                                        <option value="byMonth">Theo tháng</option>
                                        <option value="byQuarter">Theo quý</option>
                                        <option value="byYear">Theo năm</option>
                                    </select>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button id="addRoom">Thêm</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Huỷ</button>
                </div>
            </div>

        </div>
    </div>
    <table class="table table-hover table-row-cell">
        <tr>
            <th>ID</th>
            <th>Tên khách</th>
            <th>SĐT</th>
            <th>Ngày bắt dầu</th>
            <th>Ghi chú</th>
            <th>Cách thanh toán</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="item" items="${roomList}">
            <tr>
                <td>${item.id}</td>
                <td>${item.customerName}</td>
                <td>${item.phoneNumber}</td>
                <td>${item.startDate}</td>
                <td>${item.paymentMethod}</td>
                <td>
                    <a href="<c:url value='/rooms/delete?id=${item.id}' />" class="btn btn-danger delete">Xoá</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <script>
        document.querySelector("#addRoom").addEventListener("click", () => {
            document.querySelector("#formSubmit").submit();
        });
    </script>
</body>
</html>
