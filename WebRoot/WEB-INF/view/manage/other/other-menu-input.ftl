<#include "/com/uikoo9/util/jfinal/view/common/inc.ftl"/>

<form class="form-horizontal" role="form">
	<input type="hidden" name="row.id" value="${(row.id)!}"/>
	<@bsinput title='菜单名称' name='row.ucenter_menu_title' value='${(row.ucenter_menu_title)!}'/>	
	<@bsinput title='菜单地址' name='row.ucenter_menu_url' value='${(row.ucenter_menu_url)!}'/>	
	<@bsinput title='菜单序号' name='row.ucenter_menu_sn' value='${(row.ucenter_menu_sn)!}'/>	
	<@bsinput title='菜单类型' name='row.ucenter_menu_type' value='${(row.ucenter_menu_type)!}'/>	
	<@bsinput title='菜单父id' name='row.ucenter_menu_parent_id' value='${(row.ucenter_menu_parent_id)!}'/>	
		
		
		
		
</form>