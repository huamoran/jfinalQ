<#include "/WEB-INF/view/base/inc-com.ftl"/>
<form class="form-horizontal" role="form">
	<input type="hidden" name="row.id" value="${(row.id)!}"/>
	<@bsinput title='用户名' 	 name='row.user_name' value='${(row.user_name)!}'/>
	<@bsinput title='用户密码' name='row.user_key' value='${(row.user_key)!}' type='password'/>
</form>