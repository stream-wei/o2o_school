<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/jsp/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>高校跳蚤平台</title>
		<meta name="keywords" content="高校电子商务,跳蚤平台">
		<%@ include file="/WEB-INF/common/jsp/jscss.jsp"%>
		<script src="${ctx }/js/jquery.plugin/flexslider/jquery.flexslider-min.js"></script>
		<link rel="stylesheet" stye="text/css" href="${ctx }/css/index/index.css" />
		<link rel="stylesheet" stye="text/css" href="${ctx }/css/index/search.css" />
		<link rel="stylesheet" stye="text/css" href="${ctx }/js/jquery.plugin/flexslider/flexslider.css" />
	</head>
	<body>
		<%@ include file="/WEB-INF/common/jsp/head.jsp"%>
		<!--学校banner start-->
		<%-- <div class="b_banner">
			<img src="${ctx }/images/school.png" alt="xuexiao"/>
		</div> --%>
		<!-- <div id="shortcut-2014"> -->
		<div class="w">
			<div id="logo-2014" clstag="h|keycount|2015|02a">
				<a href="http://www.jd.com/" class="logo">京东</a>
			</div>
			<div id="search-2014">
				<ul id="shelper" class="hide" style="display: none;"><li>123</li></ul>
				<div class="form">
					<input clstag="h|keycount|2015|03a" type="text"
						onkeydown="javascript:if(event.keyCode==13) search('key');"
						autocomplete="off" id="key" accesskey="s" class="text">
					<button clstag="h|keycount|2015|03c"
						onclick="search('key');return false;" class="button cw-icon">
						<i></i>搜索
					</button>
				</div>
			</div>
			<div id="settleup-2014" class="dorpdown" clstag="h|keycount|2015|04a">
				<div class="cw-icon">
					<i class="ci-left"></i> <i class="ci-right">&gt;</i><i
						class="ci-count" id="shopping-amount">1</i> <a target="_blank"
						href="http://cart.jd.com/cart/cart.html">我的购物车</a>
				</div>
				<div class="dorpdown-layer">
					<div class="spacer"></div>
					<div id="settleup-content">
						<span class="loading">123</span>
					</div>
				</div>
			</div>
		</div>
		<!-- </div> -->
		<!--end 学校banner-->
		<div class="store_cate_slide">
			<!--分类 start-->
			<div class="store_cate">
				<ul>
					<c:forEach items="${categoryParents }" var="categoryParent" varStatus="status">
						<c:if test="${status.count % 2 == 0 }">
							<li class="even">
						</c:if>
						<c:if test="${status.count % 2 != 0 }">
							<li>
						</c:if>
							<h3>
							<a target="_blank" href=""> ${categoryParent.name }</a>
							</h3>
							<p>
								<c:forEach items="${categoryParent.categorys }" var="category" >
									<a target="_blank" href="#">${category.name }</a>
								</c:forEach>
							</p>
						</li>
					</c:forEach>
				</ul>
			</div>
			<!--end 分类-->
			<!--大banner start-->
			<div class="flexslider" style="width: 890px; height: 320px;float:right;margin-right:150px;">
				<ul class="slides">
					<li><img src="${ctx }/img/flexslider/1.jpg" /></li>
					<li><img src="${ctx }/img/flexslider/2.jpg" /></li>
					<li><img src="${ctx }/img/flexslider/3.jpg" /></li>
					<li><img src="${ctx }/img/flexslider/4.jpg" /></li>
				</ul>
			</div>
			<%-- <div class="big_banner">
				<img src="${ctx }/images/7.jpg" alt="banner" width="936" height="390"/>
			</div> --%>
			<!--end 大banner -->
		</div>
	
		<!--商品列表 start-->
		<div class="store_box">
			<!--广告位 start-->
			<div class="Advertising_position">
				<ul class="Advertising_detail">
					<li>
						<a title="school" href="#" target="_blank">
							<img height="240" width="180" src="${ctx }/images/1.jpg">
						</a>
					</li>
				</ul>
			</div>
			<!--end 广告位-->
	
			<!--电子类产品 start-->
			<c:forEach items="${categoryParents }" var="categoryParent">
				<div class="store_classify1">
					<div class="hd">
						<h2 class="bg1">
							<a target="_blank" href="">${categoryParent.name }</a>
						</h2>
						<div class="class_box"></div>
					</div>
					<div class="bd">
						<div class="goods_box_l">
							<a target="_blank" href="">
								<img height="390" width="190" src="${ctx }/${categoryParent.comoditys[0].imgs[0] }" title="school">
							</a>
						</div>
						<div class="goods_box_r">
							<ul>
								<li>
									<a target="_blank" href="#">
										<img height="190" width="190" src="${ctx }/${categoryParent.comoditys[0].imgs[0] }" />
										<p class="statis" style="display: none;">已售:<font>0</font>件 |<span>评论:0 </span></p>
										<p class="name"> 跳蚤</p>
										<p class="price">
											<strong>¥</strong><span>0.50</span>/<del>0.60</del>
										</p>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</c:forEach>
			<!--end 类产品分类1-->
		</div>
		<!--end 商品列表-->
		
		<%@ include file="/WEB-INF/common/jsp/footer.jsp"%>
	</body>
	<script type="text/javascript">
		$(window).load(function(){
		  $('.flexslider').flexslider({
		    animation: "slide",
		    start: function(slider){
		      $('body').removeClass('loading');
		    }
		  });
		});
	</script>
</html>