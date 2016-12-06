/**
 * Author : Arijit
 * Description : All the common and generalized javascript and jquery function for the project.
 */

function ajaxCall(url , callbackSuccess , callbackError) {
	$.ajax({
		type : "POST",
        url : url,
        timeout : 30000,
        success : function(data) {
        	callbackSuccess(data);
        },
        error : function(data) {
        	callbackError(data);
        }
    });
}