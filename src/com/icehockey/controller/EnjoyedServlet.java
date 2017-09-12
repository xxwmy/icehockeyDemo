package com.icehockey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icehockey.entity.CompetitionRecord;
import com.icehockey.entity.User;
import com.icehockey.service.CompetitionRecordService;

/**
 * Servlet implementation class EnjoyedServlet
 */
@WebServlet("/EnjoyedServlet")
public class EnjoyedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EnjoyedServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		HttpSession session = request.getSession();
		response.setContentType("application/json");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("set-Cookie", "name=value;HttpOnly");
		System.out.println("-------------EnjoyedServlet.html-----------");
		PrintWriter writer = response.getWriter();
		User user = null;
		CompetitionRecordService competitionRecordService = new CompetitionRecordService();
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("跳转后的sessionId :" + session.getId());
		System.out.println(session.getAttribute("user"));
		// session
		if (session.getAttribute("user") == null) {
			map.put("reslut", "-1");
		} else {
			System.out.println("跳转前的sessionId :" + session.getId());
			user = (User) session.getAttribute("user");
			System.out.println("user: " + user);
			if (user != null) {// 查找成功
				map.put("user", user);
				System.out.println("找到当前用户" + user);
				session.setAttribute("user", user);
				List<CompetitionRecord> invitecompetitionRecords = competitionRecordService
						.queryInviteCompetitionByUserId(user.getUserId());
				if (invitecompetitionRecords.size() != 0) {
					map.put("invitecompetitionRecords", invitecompetitionRecords);
					
					session.setAttribute("invitecompetitionRecords", invitecompetitionRecords);
				} else {
					System.out.println("没有赛事记录...");
				}
				List<CompetitionRecord> officialcompetitionRecords = competitionRecordService
						.queryOfficalCompetitionByUserId(user.getUserId());
				if (officialcompetitionRecords.size() != 0) {
					session.setAttribute("officialcompetitionRecords",
							officialcompetitionRecords);
					map.put("officialcompetitionRecords",
							officialcompetitionRecords);
				} else {
					System.out.println("没有赛事记录...");
				}
				map.put("result", "0");
			} else {
				System.out.println("map...空");
				// 第一次登陆返回result=1
				map.put("result", "-2");
			}
		}
		//页面跳转
		if ("0".equals(map.get("result"))) {// 正确操作
			writer.println("<script language='javascript'>window.location.href='./views/imformation/enjoyed.jsp'</script>");
		} else if ("-1".equals(map.get("result"))) {// 当前没有登录用户
			writer.println("<script language='javascript'>alert('当前没有登录用户');window.location.href='./views/login.html'</script>");
		} else if ("-2".equals(map.get("result"))) {// 操作失败
			writer.println("<script language='javascript'>alert('操作失败');window.location.href='./views/error.html'</script>");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
