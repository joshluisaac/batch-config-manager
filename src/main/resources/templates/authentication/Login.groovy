package templates.authentication

layout 'authentication/AuthenticationMain.groovy',
        pageTitle: 'Batch Manager | Log in',
        withBodyClasses: 'hold-transition login-page',
        boxType: 'login-box',
        mainBody: contents {
            include unescaped: 'authentication/LoginBody.vfm'
        }

