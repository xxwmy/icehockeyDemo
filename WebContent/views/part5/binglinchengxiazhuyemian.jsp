<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>兵临城下主页面</title>
		<link rel="stylesheet" href="../../css/part5/binglinchengxiazhuyemian.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
		<script>
		(function(doc, win) {
			var docEl = doc.documentElement, resizeEvt = 'orientationchange' in window ? 'orientationchange'
					: 'resize', recalc = function() {
				var clientWidth = docEl.clientWidth;
				if (!clientWidth)
					return;
				docEl.style.fontSize = 16 * (clientWidth / 720) + 'px';
			};

			if (!doc.addEventListener)
				return;
			win.addEventListener(resizeEvt, recalc, false);
			doc.addEventListener('DOMContentLoaded', recalc, false);
		})(document, window);
		</script>
		<script type="text/javascript">
			$(document).ready(function(){
			  $(".shouye").click(function(){
			    window.location.href="../part1/zhukongyemian.jsp";
			  });
			  $(".zhanshu").click(function(){
			    window.location.href="../part7/zhanshubanzhuyemian.jsp";
			  });
			  $(".zhandui").click(function(){
			    window.location.href="";
			  });
			  $(".wode").click(function(){
			    window.location.href="../part8/wodezhongxin.jsp";
			  });
			});
		</script>

	</head>

	<body>
		<div data-role="page" class="main">
			<div class="button1" onclick="javascript:history.back(-1);">
				<img src="../../img/part8/back.png" />
			</div>
			<div class="zengjia" onclick="zengjiaClick()">
				<img src="../../img/part5/plus.png" />
			</div>
			<h1 class="head">
				兵临城下
			</h1>
			<div class="button2">
				<div id="yiguanzhu" onclick="yiguanzhuClick()">
					<span>已关注</span>
				</div>
				<div id="saishixuanze" onclick="saishixuanzeClick()">
					<span>赛事选择</span>
				</div>
			</div>
			<div class="button">
							<div class="shouye" onclick="shouyeClick()">
								<span>首页</span>
							</div>
							<div  class="zhanshu" onclick="zhanshuClick()">
								<span>战术</span>
							</div>
							<div  class="zhandui" onclick="zhanduiClick()">
								<span>战队</span>
							</div>
							<div class="wode" onclick="wodeClick()">
								<span>我的</span>
							</div>
				   </div>	
		</div>

	</body>

</html>