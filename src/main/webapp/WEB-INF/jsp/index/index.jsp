<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/jsp/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>高校跳蚤平台</title>
		<meta name="keywords" content="高校电子商务,跳蚤平台">
		<link rel="stylesheet" stye="text/css" href="${ctx }/css/index/index.css" />
	</head>
	<body>
	<%@ include file="/WEB-INF/common/jsp/head.jsp"%>
	<!--学校banner start-->
	<div class="b_banner">
		<img src="${ctx }/images/school.png" alt="xuexiao"/>
	</div>
	<!--end 学校banner-->
	<div class="store_cate_slide">
		<!--分类 start-->
		<div class="store_cate">
			<ul>
				<li>
					<h3>
					<a target="_blank" href=""> 零食欢乐惠 </a>
					</h3>
					<p>
						<a target="_blank" href="index.php?app=store&id=43584&act=goods&cate=13743">饼干</a>
					</p>
				</li>
				<li class="even">
					<h3>
					<a target="_blank" href=""> 零食欢乐惠 </a>
					</h3>
					<p>
						<a target="_blank" href="index.php?app=store&id=43584&act=goods&cate=13743">饼干</a>
					</p>
				</li>
			</ul>
		</div>
		<!--end 分类-->
		<!--大banner start-->
		<div class="big_banner">
			<img src="${ctx }/images/7.jpg" alt="banner" width="936" height="390"/>
		</div>
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
									<img height="190" width="190" src="${ctx }/images/16.jpg" />
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
</html>