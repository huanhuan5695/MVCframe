
var method="";//保存提交的方法名称 
$(function(){
	
	//表格数据初始化
	$('#grid').datagrid({
		url:name+'/list',
		columns:columns,
		singleSelect:true,
		pagination:true,
		toolbar: [{
			iconCls: 'icon-add',
			text:'Add',
			handler: function(){				
				$('#editWindow').window('open');
				$('#editForm').form('clear');
				editor.html("");
				method="save";
			}
		}]

	});
	
	//条件查询
	$('#btnSearch').bind('click',function(){
		var formdata= $('#searchForm').serializeJSON();
		$('#grid').datagrid('load',formdata);		
	});
	
	//保存
	$('#btnSave').bind('click',function(){
		var formdata= $('#editForm').serializeJSON();	
		formdata.answer = editor.html();
		
		$.ajax({
			url:name+'/'+method,
			data:formdata,
			dataType:'json',
			type:'post',
			success:function(value){
				
				if(value.success){
					$('#editWindow').window('close');
					$('#grid').datagrid('reload');
				}
				$.messager.alert('提示',value.message);				
			}
			
		});
		
		
	});
	
	
});

/**
 * 删除 
 */
function dele(id){
	
	$.messager.confirm('提示','确定要删除此记录吗？',function(r){
		if(r)
		{
			$.ajax({
				url:name+'/delete?id='+id,
				dataType:'json',
				success:function(value){
					if(value.success){
						$('#grid').datagrid('reload');
					}
					$.messager.alert('提示',value.message);
				}
			});		
		}	
	});	
}

/**
 * 编辑
 */
function edit(id){
	
	$('#editWindow').window('open');
	$('#editForm').form('clear');
	editor.html("");

	$.ajax({
		url:name+'/query?id='+id,
		dataType:'json',
		success:function(value){
            $('#editForm').form('load',value);
			editor.html(value.answer);
		}
	});		
	method="update";
}
