yieldUnescaped '<!DOCTYPE html>'
html(lang: 'en') {
	head {
		meta(charset: 'utf-8')
		meta('http-equiv': '"Content-Type" content="text/html; charset=utf-8"')
		meta(name: 'viewport', content: '"width=device-width, initial-scale=1"')
		title('Person List')
		link(rel: "stylesheet", href: "plugins/vendors/fontawesome-free/css/all.min.css")
		link(rel: "stylesheet", href: "plugins/vendors/ionicframework/ionicons/2.0.1/css/ionicons.min.css")
		link(rel: "stylesheet", href: "plugins/vendors/pace-progress/css/themes/black/pace-theme-flat-top.css")
		link(rel: "stylesheet", href: "dist/css/adminlte.min.css")
		link(rel: "stylesheet", href: "https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700")
	}
	body(class: "hold-transition sidebar-mini pace-primary") {
		div(class: "wrapper"){
			include unescaped: 'layouts/NavigationBar.vfm'
			include unescaped: 'layouts/MainSideBar.vfm'
			include unescaped: 'layouts/PageContent.vfm'
			include unescaped: 'layouts/MainFooter.vfm'
			include unescaped: 'layouts/ControlSideBar.vfm'
		}
		script('', type:'text/javascript',src: "plugins/vendors/jquery/jquery.min.js")
		script('', type:'text/javascript',src: "plugins/vendors/bootstrap/4_4/dist/js/bootstrap.min.js")
		script('', type:'text/javascript',src: "plugins/vendors/pace-progress/js/pace.min.js")
		script('', type:'text/javascript', src: "dist/js/adminlte.min.js")
	}
}
