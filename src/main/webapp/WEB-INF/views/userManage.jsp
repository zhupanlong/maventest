<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
    <link rel="stylesheet" type="text/css" href="<%=path%>/js/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/js/easyUI/themes/icon.css">
    <script type="text/javascript" src="<%=path%>/js/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/easyUI/easyui-lang-zh_CN.js"></script>
    <title>用户管理</title>
</head>
<body>
<div>
    <div id="toolbar">
        <label>查询选项：</label>
        <select id="itemsselect" name="researchitem" class="easyui-combobox">
            <option value="" selected="selected">请选择</option>
            <c:forEach items="${sessionScope.itemlist}" var="item" varStatus="">
                <c:if test="${item.tablename=='T_USER'}">
                    <option value="${item.columnname}">${item.description}</option>
                </c:if>
            </c:forEach>
        </select>
        <input id="s_username" class="easyui-textbox"/>
        <a href="javascript:searchUserByName()" class="easyui-linkbutton"
           iconCls="icon-search">查询</a> <a href="javascript:reset()"
                                           class="easyui-linkbutton" iconCls="icon-clear"></a> <a
            href="javaScript:openAddOrUpdateUserFormDialog()"
            class="easyui-linkbutton" iconCls="icon-add">添加用户</a>
        <a href="javaScript:exportExcel()"
           class="easyui-linkbutton" iconCls="icon-print">导出到excel</a>
        <a href="javaScript:openFileSelectDialog()"
           class="easyui-linkbutton" iconCls="icon-redo">将excel数据导入数据库</a>
    </div>
    <div id="userGird"></div>
    <div id="fileSelectDialog" class="easyui-dialog" style="width: 300px; height: 150px; padding: 30px 20px"
         closed="true">
        <form id="fileSelectForm" enctype="multipart/form-data" method="post">
            <!-- <input id="headersId" name="headersId" class="easyui-textbox" type="hidden"> -->
            <label>选择文件：</label><input id="excel" name="excel"
                                       class="easyui-filebox" required="true"/>
        </form>
        <div align="center">
            <a href="javascript:importExcel()" class="easyui-linkbutton" iconCls="icon-redo">导入</a>
            <a href="javascript:closeSelectDialog()" class="easyui-linkbutton" iconCls="icon-clear">取消</a>
        </div>
    </div>
    <div id="addOrUpdateUserFormDialog" class="easyui-dialog" style="width: 350px; height: 400px; padding: 30px 20px"
         closed="true">
        <!-- closed="true" -->
        <form id="addOrUpdateForm">
            <input id="u_id" name="id" type="hidden"/>
            <div>
                <label>用户账号：</label><input id="u_username" name="username"
                                           class="easyui-textbox" required="true"/>
            </div>
            <div id="password">
                <label>用户密码：</label><input id="u_password" name="password"
                                           class="easyui-textbox" required="true"/>
            </div>
            <div>
                <label>用户名字：</label><input id="u_name" name="name"
                                           class="easyui-textbox" required="true"/>
            </div>
            <div>
                <label>用户性别：</label><select id="u_sex" name="sex"
                                            class="easyui-combobox">
                <option value="无">请选择</option>
                <option value="男">男</option>
                <option value="女">女</option>
            </select>
            </div>
            <div>
                <label>入职时间：</label><input id="u_regtime" name="regtime"
                                           class="easyui-datebox"/>
            </div>
            <div>
                <label>email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input
                    id="u_email" name="email" class="easyui-textbox" validType="email"/>
            </div>
            <div>
                <label>QQ号码:&nbsp;&nbsp;&nbsp;&nbsp;</label><input id="u_qq"
                                                                   name="qq" class="easyui-textbox">
            </div>
            <div style="height: 30px;">
                <label>用户微信:&nbsp;&nbsp;</label> <input id="u_weixin" name="weixin"
                                                        class="easyui-textbox">
            </div>
            <div style="height: 30px;">
                <label>是否启用:&nbsp;&nbsp;</label> <select id="u_enable" name="enable"
                                                         class="easyui-combobox">
                <option value="1">已启用</option>
                <option value="0">未启用</option>
            </select>
            </div>
        </form>
        <div>
            <a href="javascript:submitForm()" class="easyui-linkbutton" iconCls="icon-save">保存</a>
            <a href="javascript:closeDialog()" class="easyui-linkbutton" iconCls="icon-clear">取消</a>
        </div>
    </div>
    <div id="roleSelectDialog" class="easyui-dialog" style="width:400px;height:100px;" closed="true">
        <input id="userId" name="userId" type="hidden"/>
        <input id="roleSelect" name="roleSelect"/>
        <input type="button" value="保存" iconCls="icon-save" onclick="saveUserRole()"/>
    </div>
</div>
<script type="text/javascript">
    var path = '<%=path%>';

    function openAddOrUpdateUserFormDialog() {
        $("#addOrUpdateUserFormDialog").dialog("open").dialog("setTitle",
            "添加用户");
    }

    function closeDialog() {
        $("#addOrUpdateUserFormDialog").dialog("close");
    }

    function searchUserByName() {
        var keyword = $("#s_username").textbox('getValue');
        var column=$("#itemsselect option:selected").val();
        var url = path + "/user/selectRecordsByPage.do";
        $('#userGird').datagrid({
            url: url,
            queryParams: {"keyword": keyword,"column":column}
        });
    }

    function reset() {
        $("#s_username").textbox('setValue','');
        var url = path + "/user/selectRecordsByPage.do";
        $('#userGird').datagrid({
            url: url,
            queryParams: {}
        });
    }
    function submitForm() {
        $("#addOrUpdateForm").form("submit", {
            onSubmit: function () {
                return $(this).form("enableValidation").form("validate");
            },
            success: function (data) {
                saveOrUpdateUser();
            }
        });
    }

    function saveOrUpdateUser() {
        $.ajax({
            type: "POST",
            data: $('#addOrUpdateForm').serialize(),
            dataType: 'text',
            url: path + '/user/saveOrUpdateUser.do',
            success: function (result) {
                if (result == 1) {
                    $.messager.alert('提示', '操作成功', 'info');
                    closeDialog();
                    $('#userGird').datagrid('reload');
                }
            },
            error: function (e) {
                $.messager.alert('提示', '操作失败', 'error');
            }
        });
    }

    var path = '<%=path%>';
    $(function () {
        $('#userGird').datagrid({
            loadMsg: "正在加载数据，请稍等...",
            url: path + "/user/selectRecordsByPage.do",
            fitColumns: true,
            rownumbers: true,
            toolbar: '#toolbar',
            singleSelect: true,
            pagination: true,//设置是否分页
            pageList: [1, 5, 10, 20, 40],/* 设置每页显示记录条数 */
            pageSize: 10,/* 设置每页默认显示记录条数 */
            columns: [[
                {title: '账户名', field: 'username', width: 100},
                {title: '实际名字', field: 'name', width: 100},
                {title: '性别', field: 'sex', width: 100},
                {title: '邮箱', field: 'email', width: 100},
                {title: 'QQ', field: 'qq', width: 100},
                {title: '微信', field: 'weixin', width: 100},
                {title: '注册日期', field: 'regtime', width: 100},
                {
                    title: '是否启用', field: 'enable', width: 100,
                    formatter: function (value, row, index) {
                        return value == "1" ? "已启用" : "未启用"
                    }
                },
                {
                    title: '操作', field: 'id', width: 150,
                    formatter: function (value, row, index) {
                        var str = "";
                        str += "  <a href=\"javascript:loadRoleAuthority('" + value + "')\">角色配置</a>  ";
                        str += "  <a href=\"javascript:deleteUser('" + value + "')\">删除</a>  ";
                        str += "  <a href=\"javascript:updateUserDialog('" + value + "')\">修改</a>  ";
                        return str;
                    }
                }
            ]]
        });
    });

    function deleteUser(id) {
        $.ajax({
            type: "post",
            dataType: "text",
            data: {"id": id},
            url: path + '/user/deleteUserById.do',
            success: function (data) {
                if (data == 1) {
                    $.messager.alert("提示", "删除成功", "info");
                    $('#userGird').datagrid('reload');
                }
            },
            error: function (data) {
                $.messager.alert("提示", "操作失败", "info");
            }
        });
    }

    function updateUserDialog(id) {
        $("#addOrUpdateForm").form("clear");
        $.ajax({
            type: "POST",
            url: path + "/user/getUserById.do",
            data: {"id": id},
            dataType: 'json',
            success: function (data) {
                $("#u_id").val(data.id);
                $("#u_username").textbox('setValue', data.username);
                $("#u_name").textbox('setValue', data.name);
                $("#u_password").hide();
                $("#u_sex").combobox('setValue', data.sex);
                $("#u_regtime").datebox('setValue', data.regtime);
                $("#u_email").textbox('setValue', data.email);
                $("#u_qq").textbox('setValue', data.qq);
                $("#u_weixin").textbox('setValue', data.weixin);
                $("#u_enable").combobox('setValue', data.enable);
                $('#addOrUpdateUserFormDialog').dialog('open').dialog('setTitle', '修改用户');
            },
            error: function (e) {
                $.messager.alert('提示', '操作失败', 'error');
            }
        });
    }


    //配置用户角色
    function loadRoleAuthority(id) {
        $('#userId').val(id);
        $('#roleSelectDialog').dialog('open').dialog('setTitle', '角色配置');
        //查询角色列表
        $.ajax({
            type: "POST",
            url: path + "/user/getRoleListByUserId.do",
            data: {'id': id},
            dataType: 'json',
            success: function (data) {
                $('#roleSelect').combobox({
                    data: data.rolelist,
                    valueField: 'id',
                    textField: 'name'
                });
                $('#roleSelect').combobox('setValue', data.roleid);
            },
            error: function (e) {
                $.messager.alert('提示', '操作失败', 'error');
            }
        });

    }

    //保存用户角色
    function saveUserRole() {
        var json = {'userid': $('#userId').val(), 'roleid': $('#roleSelect').combobox('getValue')};
        $.ajax({
            type: "POST",
            url: path + "/user/saveUserRole.do",
            data: json,
            dataType: 'text',
            success: function (data) {
                if ("1" == data) {
                    $.messager.alert('提示', '操作成功', 'info');
                    $('#roleSelectDialog').dialog('close');
                } else {
                    $.messager.alert('提示', '操作失败', 'info');
                }
            },
            error: function (e) {
                $.messager.alert('提示', '操作失败', 'error');
            }
        });
    }

    //导出excel
    function exportExcel() {
        var columns = $("#userGird").datagrid("options").columns[0];
        var headers = '';
        var headersIds = '';
        for (var i = 0; i < columns.length - 1; i++) {
            if (headers == '') {
                headers += columns[i].title;
            } else {
                headers += "," + columns[i].title;
            }
            if (headersIds == '') {
                headersIds += columns[i].field;
            } else {
                headersIds += "," + columns[i].field;
            }

        }
        //获取查询条件
        var sname = $("#s_username").textbox('getValue');
        //获取当前页数及记录数
        var grid = $('#userGird');
        var options = grid.datagrid('getPager').data("pagination").options;
        var currpage = options.pageNumber;
        var data = $('#userGird').datagrid('getData');
        var rows = data.rows.length;
        /* $.post(path+"/user/exportExcel.do",{'name':sname},function(result){
            if(result="1"){
                $.messager.alert('提示', '操作成功', 'info');
            }else{
                $.messager.alert('提示', '操作失败', 'error');
            }
        },"text"); */
        window.location.href = path + "/user/exportUserExcel.do?sname=" + encodeURI(encodeURI(sname)) + "&headers=" + headers + "&headersIds=" + headersIds + "&currpage=" + currpage + "&rows=" + rows;
    }

    /* function exportExcel(){
        //获取表头及字段名
        var columns = $("#userGird").datagrid("options").columns[0];
        var headers='';
        var headersIds='';
         for (var i = 0; i < columns.length-1; i++) {
            if(headers == ''){
                headers+=columns[i].title;
            }else{
                headers+=","+columns[i].title;
            }
            if(headersIds == ''){
                headersIds+=columns[i].field;
            }else{
                headersIds+=","+columns[i].field;
            }

        }
        //获取查询条件
        var sname=$("#s_username").textbox('getValue');
        //获取当前页数及记录数
        var grid = $('#userGird');
        var options = grid.datagrid('getPager').data("pagination").options;
        var currpage = options.pageNumber;
        var data = $('#userGird').datagrid('getData');
        var rows = data.rows.length;
        $.ajax({
            type:"post",
            data:{'title':'用户信息表','headers':headers,'headersIds':headersIds,'sname':sname,'currpage':currpage,'rows':rows},
            dataType:"text",
            url:path+"/user/exportUserExcel.do",
            success: function(data){
                if("1"==data){
                    $.messager.alert('提示', '操作成功', 'info');
                    $('#roleSelectDialog').dialog('close');
                }else{
                    $.messager.alert('提示', '操作失败', 'info');
                }
            },
            error: function(e){
                $.messager.alert('提示', '操作失败', 'error');
            }
        });
    } */
    function openFileSelectDialog() {
        $("#fileSelectDialog").dialog("open").dialog("setTitle",
            "选择文件");
    }

    function importExcel() {
        var columns = $("#userGird").datagrid("options").columns[0];
        var headersIds = '';
        for (var i = 0; i < columns.length - 1; i++) {
            if (headersIds == '') {
                headersIds += columns[i].field;
            } else {
                headersIds += "," + columns[i].field;
            }
        }
        $('#fileSelectForm').form('submit', {
            url: path + "/user/importUserExcel.do?headersIds=" + headersIds,
            onSubmit: function () {
                return $(this).form("enableValidation").form("validate");
            },
            success: function (data) {
                if (data == 1) {
                    $.messager.alert('提示', '操作成功', 'info');
                } else {
                    $.messager.alert('提示', data, 'info');
                }
                $('#fileSelectDialog').dialog('close');
                $('#userGird').datagrid('reload');
            },
            error: function (e) {
                $.messager.alert('提示', '操作失败', 'error');
            }
        });
    }

    function closeSelectDialog() {
        $("#fileSelectDialog").dialog("close");
    }
</script>
</body>
</html>