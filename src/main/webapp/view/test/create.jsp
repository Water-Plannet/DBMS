<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>用户添加页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path}/test/create.do" method="post" class="form-horizontal" role="form">
                    <fieldset>
                        <legend>用户基本信息</legend>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="testName">姓名</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="testName" placeholder="姓名"/>
                          </div>
                          <label class="col-sm-2 control-label" for="ds_name">性别</label>
                          <div class="col-sm-4">
                            <zhg:select codeTp="sex" def="true" cls="form-control" name="testSex"></zhg:select>
                          </div>
                       </div>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="ds_username">生日</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="date"  name="testDate" />
                          </div>
                       </div>
                    </fieldset>
                    <fieldset>
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="submit" value="提交" class="btn btn-primary"/>
                           	</div>
                           	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                           	</div>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/dictionary.js"></script>
</html>