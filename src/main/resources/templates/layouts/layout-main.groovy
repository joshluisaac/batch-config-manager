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
		h2('A Groovy View with Spring MVC + Spring Boot')
		div("msg: Message")
		div("time: Time...")
	}
}
