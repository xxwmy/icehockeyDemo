<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>性别选择</title>
		<link rel="stylesheet" href="../../css/part4/tianbingtianjiangzhuyemian.css" />
		<link rel="stylesheet" href="../../css/part4/xingbiexuanze.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css"/>
		
		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>	
		<script type="text/javascript">
			$(document).ready(function(){
			  $(".man_div").click(function(){
			    window.location.href="shengao.jsp";
			  });
			  $(".lady_div").click(function(){
				    window.location.href="shengao.jsp";
				  });
			  
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
		<!--	屏幕适配	-->
		<script>
			(function(doc, win) {
				var docEl = doc.documentElement,
					resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
					recalc = function() {
						var clientWidth = docEl.clientWidth;
						if(!clientWidth) return;
						docEl.style.fontSize = 16 * (clientWidth / 720) + 'px';
					};

				if(!doc.addEventListener) return;
				win.addEventListener(resizeEvt, recalc, false);
				doc.addEventListener('DOMContentLoaded', recalc, false);
			})(document, window);
		</script>

		<div data-role="page" class="tianbingtianjiangzhuyemian main">
			<div data-role="content">
				<div class="header">
					<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
					<span>添兵添将</span>
				</div>
				
				<div  class="text">
					<p>
		     		我们会根据您的身体资料<br/> 
		        	优化您的运动算法
					</p>
				</div>
						       
		       <div class="gender">
					<div class="man_div">
						<img src="../../img/part4/man.png" id="man"/>
					</div>	
					
					<div class="lady_div">
						<img src="../../img/part4/lady.png" id="lady"/> 
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
			
        </div>
        
        <script src="../../js/common/common.js"></script>
		<script src="../../js/urlApi/api.js"></script>
		<script type="text/javascript" src="../../js/part4/xingbiexuanze.js" ></script>
	</body>
</html>