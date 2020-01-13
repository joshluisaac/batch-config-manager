package templates.authentication.login

layout 'authentication/AuthenticationMain.groovy',
        pageTitle: 'Batch Manager | Log in',
        withBodyClasses: 'hold-transition login-page',
        boxType: 'login-box',
        mainBody: contents {
            include unescaped: 'authentication/login/LoginBody.vfm'
        }

